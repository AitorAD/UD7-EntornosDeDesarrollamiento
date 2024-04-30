public class Zapping {
    private static final int MAX_CHANEL = 99;
    private static final int MIN_CHANEL = 0;
    private static final int MEDIA_CHANEL = 50;

    public static int cambiaCanal(int canalOrigen, int canalDestino) {
        int nClic = 0;

        if (isValidChanel(canalOrigen) && isValidChanel(canalDestino)) {
            if (canalOrigen != canalDestino) {
                nClic = Math.abs(canalOrigen - canalDestino);
                if (nClic >= MEDIA_CHANEL) {
                    if (canalOrigen < canalDestino) {
                        nClic = Math.abs((canalOrigen + MAX_CHANEL) - canalDestino);
                    } else {
                        nClic = Math.abs((canalOrigen - MAX_CHANEL) - canalDestino);
                    }
                }
            }
        }
        return nClic;
    }

    private static boolean isValidChanel(int canal) {
        boolean isValidChanel = canal <= MAX_CHANEL && canal >= MIN_CHANEL;
        if (isValidChanel) {
            return true;
        }
        return false;
    }
}
