package controllers;

import core.Controller;
import views.EventListView;
import views.HomeView;
import views.NewEventView;
import views.RegistrarInvitadoView;

/**
 * Main controller. It will be responsible for program's main screen behavior.
 */
public class HomeController extends Controller
{
    private final NewEventController newEventController = new NewEventController();
    private final EventListController eventListController = new EventListController();
    private final RegistrarInvitadoController registrarInvitadoController = new RegistrarInvitadoController();
    //-----------------------------------------------------------------------
    //		Methods
    //-----------------------------------------------------------------------
    @Override
    public void run()
    {
        // Initializes others controllers
        newEventController.run();
        eventListController.run();
        registrarInvitadoController.run();

        // Initializes HomeView
        //-----------------------------------------------------------------------
        //		Attributes
        //-----------------------------------------------------------------------
        HomeView homeView = new HomeView(this, mainFrame);
        addView("HomeView", homeView);

        // Displays the program window
        mainFrame.setVisible(true);
    }


    //-----------------------------------------------------------------------
    //		Getters
    //-----------------------------------------------------------------------

    public NewEventView getNewEventView()
    {
        return newEventController.getView();
    }

    public EventListView getEventListView()
    {
        return eventListController.getView();
    }

    public RegistrarInvitadoView getRegistrarInvitadoView(){return registrarInvitadoController.getView();}

    public void listEvents()
    {
        eventListController.getEventList();
    }
}
