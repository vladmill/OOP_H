package homework07.view;

import homework07.presenter.Presenter;

import java.io.IOException;

public interface View {
   void setPresenter(Presenter presenter);
   void start() throws IOException;
}
