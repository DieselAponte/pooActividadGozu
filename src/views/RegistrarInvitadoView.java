    package views;

    import java.awt.Font;
    import java.text.ParseException;

    import javax.swing.*;
    import javax.swing.text.MaskFormatter;

    import controllers.NewEventController;
    import controllers.RegistrarInvitadoController;
    import core.Model;
    import core.View;
    import models.Frequency;
    import models.SchedulerEvent;
    import models.SchedulerUtil;

    public class RegistrarInvitadoView extends JPanel implements View {
        //-----------------------------------------------------------------------
        //		Attributes
        //-----------------------------------------------------------------------
        private final RegistrarInvitadoController registrarInvitadoController;

        private JTextField tf_nombreInvitado;
        private JTextField tf_numCelular;
        private JTextField tf_direccion;
        private JCheckBox cbx_aceptarTerminos;
        private JRadioButton rbtn_masculino;
        private JRadioButton rbtn_feminino;
        public RegistrarInvitadoView(RegistrarInvitadoController registrarInvitadoController){
            this.registrarInvitadoController = registrarInvitadoController;
            make_frame();
            make_field_ingresarNombre();
            make_field_ingresarNumCelular();
            make_field_genero();
            make_field_fechaNacimiento();
            make_field_direccion();
            make_field_aceptarTerminos();
            make_btn_registrar();
            make_btn_resetear();

        }
        @Override
        public void update(Model model, Object data){

        }
        private void make_frame(){setLayout(null);}

        private void make_field_ingresarNombre()
        {
            JLabel lbl_IngresarNombre = new JLabel("Ingrese Nombre:");
            lbl_IngresarNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
            lbl_IngresarNombre.setBounds(29,29,134,14);
            add(lbl_IngresarNombre);

            tf_nombreInvitado = new JTextField();
            tf_nombreInvitado.setBounds(200,26,196,20);
            add(tf_nombreInvitado);
            tf_nombreInvitado.setColumns(10);
        }
        private void make_field_ingresarNumCelular() {
            JLabel lbl_IngresarNumCelular = new JLabel("Ingrese Numero de Celular:");
            lbl_IngresarNumCelular.setBounds(29, 71, 200, 14);
            add(lbl_IngresarNumCelular);

            tf_numCelular = new JTextField();
            tf_numCelular.setBounds(200, 68, 196, 20);
            add(tf_numCelular);
            tf_numCelular.setColumns(10);
        }
        private void make_field_genero(){
            final ButtonGroup btng_genero = new ButtonGroup();
            JLabel lbl_genero = new JLabel("Genero:");
            lbl_genero.setFont(new Font("Tahoma", Font.BOLD, 11));
            lbl_genero.setBounds(29,120,78,14);
            add(lbl_genero);

            rbtn_masculino = new JRadioButton("Masculino");
            btng_genero.add(rbtn_masculino);
            rbtn_masculino.setSelected(true);
            rbtn_masculino.setBounds(169, 120, 90, 23);
            add(rbtn_masculino);

            rbtn_feminino = new JRadioButton("Feminino");
            btng_genero.add(rbtn_feminino);
            rbtn_feminino.setSelected(true);
            rbtn_feminino.setBounds(270, 120, 90, 23);
            add(rbtn_feminino);
        }

        private void make_field_fechaNacimiento() {
            JLabel lbl_fechaNacimiento = new JLabel("Fecha de Nacimiento:");
            lbl_fechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 11));
            lbl_fechaNacimiento.setBounds(29, 160, 150, 14);
            add(lbl_fechaNacimiento);

            // ComboBox para día
            String[] dias = new String[31];
            for (int i = 0; i < 31; i++) {
                dias[i] = String.valueOf(i + 1);
            }
            JComboBox<String> cb_dia = new JComboBox<>(dias);
            cb_dia.setBounds(169, 160, 50, 22);
            add(cb_dia);

            // ComboBox para mes
            String[] meses = {
                    "Ene", "Feb", "Mar", "Abr", "May", "Jun",
                    "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"
            };
            JComboBox<String> cb_mes = new JComboBox<>(meses);
            cb_mes.setBounds(230, 160, 60, 22);
            add(cb_mes);

            // ComboBox para año (1920 - 2025)
            int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
            int startYear = 1920;
            String[] anios = new String[currentYear - startYear + 1];
            for (int i = 0; i < anios.length; i++) {
                anios[i] = String.valueOf(currentYear - i); // años en orden descendente
            }
            JComboBox<String> cb_anio = new JComboBox<>(anios);
            cb_anio.setBounds(300, 160, 70, 22);
            add(cb_anio);
        }

        private void make_field_direccion() {
            JLabel lbl_direccion = new JLabel("Dirección:");
            lbl_direccion.setFont(new Font("Tahoma", Font.BOLD, 11));
            lbl_direccion.setBounds(29, 195, 134, 14);
            add(lbl_direccion);

            tf_direccion = new JTextField();
            tf_direccion.setBounds(169, 192, 200, 20);
            add(tf_direccion);
            tf_direccion.setColumns(10);
        }
        private void make_field_aceptarTerminos() {
            cbx_aceptarTerminos = new JCheckBox("Acepto los términos y condiciones");
            cbx_aceptarTerminos.setFont(new Font("Tahoma", Font.PLAIN, 11));
            cbx_aceptarTerminos.setBounds(29, 220, 220, 23);
            add(cbx_aceptarTerminos);
        }

        private void make_btn_registrar(){
            JButton btn_registrar = new JButton("Registrar");
            btn_registrar.setFont(new Font("Tahoma", Font.BOLD, 11));
            btn_registrar.setBounds(164, 270, 89, 23);
            add(btn_registrar);
        }
        private void make_btn_resetear(){
            JButton btn_resetear = new JButton("Resetear");
            btn_resetear.setFont(new Font("Tahoma", Font.BOLD, 11));
            btn_resetear.setBounds(300, 270, 89, 23);
            add(btn_resetear);
        }


    }
