package controllers;

import core.Controller;
import views.EventListView;
import views.HomeView;
import views.NewEventView;


/**
 * Main controller. It will be responsible for program's main screen behavior.
 */
public class HomeController extends Controller
{
    private final NewEventController newEventController = new NewEventController();
    private final EventListController eventListController = new EventListController();

    //-----------------------------------------------------------------------
    //		Methods
    //-----------------------------------------------------------------------
    @Override
    public void run()
    {
        // Initializes others controllers
        newEventController.run();
        eventListController.run();

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

    public void listEvents()
    {
        eventListController.getEventList();
    }
}
