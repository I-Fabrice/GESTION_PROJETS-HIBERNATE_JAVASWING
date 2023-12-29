package ihm;

import javax.swing.*;

public class Function_edit {

    JDialogequipe jDialogequipe;

    public Function_edit(JDialog jDialogequipe){
        this.jDialogequipe = (JDialogequipe) jDialogequipe;
    }

    public void Undo(){
        jDialogequipe.undoManager.undo();
    }



}
