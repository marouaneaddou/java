
public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        ChifoumiAction result = ChifoumiAction.SCISSOR;
        switch (chifoumiAction) {
            case ROCK:
                result = ChifoumiAction.SCISSOR;
                break;
            case SCISSOR:
                result = ChifoumiAction.PAPER;
                break;
            case PAPER:
                result = ChifoumiAction.ROCK;
                break;
        }
        return result;
    }
}