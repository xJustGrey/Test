public class MortalCombat {
    public static void main(String[] args) {
        Dk dk = new Dk();
        DK2 dk2 = new DK2();
        fight(dk, dk2);
    }

    private static void fight(Dk dk, DK2 dk2) {
        while (true) {
            if (!dk.isAliveDK && dk2.iSAliveDK2) {
                System.out.println("ДК 1 мертв. Дк 2 победил");
                break;
            } else if (dk.isAliveDK && !dk2.iSAliveDK2) {
                System.out.println("ДК 2 мертв. ДК 1 победил");
                break;
            } else if (!dk.isAliveDK && !dk2.iSAliveDK2) {
                System.out.println("Оба мертвы");
                break;
            }
            if (dk.healthDk < 0) {
                dk.isAliveDK = false;
            } else {
                dk.healthDk -= dk2.kickPowerDK2;
            }
            if (dk2.healthDK2 < 0) {
                dk2.iSAliveDK2 = false;
            } else {
                dk2.healthDK2 -= dk.powerKickDK;
            }
        }


    }

}

