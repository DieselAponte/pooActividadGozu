package controllers;

import core.Controller;
import models.EventListModel;
import views.RegistrarInvitadoView;

import javax.swing.*;

public class RegistrarInvitadoController extends Controller {

    private RegistrarInvitadoView registrarInvitadoView;

    @Override
    public void run()
    {
       registrarInvitadoView = new RegistrarInvitadoView(this);
    }

    public RegistrarInvitadoView getView(){
        return registrarInvitadoView;
    }
}
