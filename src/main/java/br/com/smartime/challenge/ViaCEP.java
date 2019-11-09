import java.util.Scanner;
import viacep.ViaCEP;
import viacep.ViaCEPEvents;
import viacep.ViaCEPException;

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

    ViaCEP viaCep = ViaCEP();

    try {
        viaCep.buscar(txtCEP.getText());
        txtBairro.setText(viaCep.getBairro());;
        txtRua.setText(viaCep.getLogradouro());
        txtUF.setText(viaCep.getUF());
        txtCidade.setText(viaCep.getLocalidade());

    }  catch (ViaCEPException ex) {
        Logger.getLogger(ViewCEP.class.getName()).log(Level.SEVERE, null, ex);
    }
}

//Author: Alisson