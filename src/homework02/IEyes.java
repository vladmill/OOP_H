package homework02;

public interface IEyes {
    default boolean hasEyes(){
        return true;
    }
    public int getNumberEyes();
}
