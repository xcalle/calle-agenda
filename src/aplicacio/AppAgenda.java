package aplicacio;

import menu.Menu;

public class AppAgenda {
    public static void main(String[] args) {
        String[] opcions = {
                "Afegir Contacte",
                "Buscar Contacte",
                "Modificar Contacte",
                "Eliminar Contacte",
                "Mostrar Contactes",
                "Sortir"
        };
        boolean sortir = false;
        while (!sortir) {
            int opcio = Menu.obteOpcioMenu(opcions,
                    "Menu Principal",
                    "Escull una opció");
            switch (opcio) {
                case 1:
//                    afegirContacte();
                    break;
                case 2:
//                    buscarContacte();
                    break;
                case 3:
//                    modificarContacte();
                    break;
                case 4:
//                    eliminarContacte();
                    break;
                case 5:
//                    mostrarContactes();
                    break;
                case 6:
//                    guardarAgenda(nomFitxerAmbAgenda);
                    sortir = true;
                    EinesJoan.pintaComiat();
                    break;
                default:
                    System.out.println("Opció no vàlida!");
            }
        }

//        String _carrer = "Av. Diagonal";
//        int _numeroCarrer = 34;
//        String _ciutat = "Barcelona";
//        String _codiPostal = "08030";
//        String _pais = "Espanya";
//
//        Adressa adressa = new Adressa(_carrer, _numeroCarrer, _ciutat, _codiPostal, _pais);
//
//        System.out.println("L'adressa té el carrer " + adressa.getCarrer() + " el número " + adressa.getNumeroCarrer());
//        String menu = "Menú";
//        System.out.println(menu);
//        pintaLinia(menu,"-");
    }
}