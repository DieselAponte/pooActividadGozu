package core;

public interface Model {
    /**
     * Attaches an observer in the model.
     *
     * @param view View to be attached
     */
    void attach(View view);

    /**
     * Detaches a view from the model.
     *
     * @param view View to be detached
     */
    void detach(View view);

    /**
     * Notify all attached views in the model.
     */
    void notifyViews();
}
