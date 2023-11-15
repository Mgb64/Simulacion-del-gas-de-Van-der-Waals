/*
 * JPanel que muestra los valores de las variables termodinamicas, permite 
 * su modificacion y que se fijen. Muestra creditos en la esquina inferior derecha.
 */

package GUI;

import javax.swing.JPanel;
import javax.swing.JSlider;

public class PanelVariables extends JPanel{

    //Enumeraciones
    private int TEMPERATURA  = 0;
    private int PRESION = 1;
    private int MOLES = 2;
    private int VOLUMEN = 3;
    private int INTERACCION_MOLECULAR = 4;
    private int VOLUMEN_MOLECULAR = 5;
    private int CANTIDAD_DESLIZADORES = 6;

    // Variables de la ecuacion del gas de Van Der Waals
    private int temperatura;
    private int presion;
    private int moles;
    private int volumen;
    private int interaccionMolecular;
    private int volumenMolecular;

    // Parte gráfica
    private JSlider Deslizadores[];
    
    protected void inicializar(){

        Deslizadores = new JSlider[6];

        for(int i = 0; i < CANTIDAD_DESLIZADORES; ++i){
            Deslizadores[i] = new JSlider();
        }
    }   
}


