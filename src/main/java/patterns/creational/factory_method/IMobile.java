package patterns.creational.factory_method;

abstract class IMobile {
    void prepare() {
        System.out.println("Подготовим документы по продаже от ООО Билайн");
    }

    void setInternetTariff() {
        System.out.println("Установим стандартный тариф Билайна для интернета");
    }

    void box() {
        System.out.println("Упакуем в желтый пакетик");
    }
}

abstract class BeelineStore {
    protected abstract IMobile getMobile(String type);

    public IMobile orderPhone(String type) {
        IMobile mobile = getMobile(type);

        mobile.prepare();
        mobile.setInternetTariff();
        mobile.box();

        return mobile;
    }
}

class CenterBeelineSamsung extends IMobile {
    void setInternetTariff() {
        System.out.println("Отдельный тариф для 5G интернета в центре России");
    }
}

class CenterBeelineIPhone extends IMobile {
}

class CenterBeelineStore extends BeelineStore {
    @Override
    public IMobile getMobile(String type) {
        if (type.equals("samsung")) {
            return new CenterBeelineSamsung();
        } else if (type.equals("iphone")) {
            return new CenterBeelineIPhone();
        }

        return null;
    }

    public void tradeIn(String phone) {
        System.out.println("Вы обменяли старый телефон на новый с доплатой");
    }
}

class UralBeelineSamsung extends IMobile {
    void setInternetTariff() {
        System.out.println("Отдельный тариф для 5G интернета на Урале");
    }
}

class UralBeelineIPhone extends IMobile {
    void setInternetTariff() {
        System.out.println("Отдельный тариф для стандартного интернета на Урале");
    }
}

class UralBeelineStore extends BeelineStore {
    public IMobile getMobile(String type) {
        if (type.equals("samsung")) {
            return new UralBeelineSamsung();
        } else if (type.equals("iphone")) {
            return new UralBeelineIPhone();
        }

        return null;
    }
}