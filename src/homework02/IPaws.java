package homework02;

public interface IPaws extends IEyes {
    default int getNumberPaws(){
        return 4;
    }

}
