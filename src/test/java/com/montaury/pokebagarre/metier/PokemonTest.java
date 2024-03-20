package com.montaury.pokebagarre.metier;


import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    public void test_pokemon1_gagne_avec_meilleure_attaque(){
    //GIVEN
    Pokemon leH = new Pokemon("leH", "leH.png", new Stats(200, 100) );
    Pokemon staline = new Pokemon("staline", "staline.png", new Stats(180, 120));

    //WHEN
    boolean est_vainqueur = leH.estVainqueurContre(staline);

    //THEN
    assertEquals(true, est_vainqueur);
}

    @Test
    public void test_pokemon2_gagne_avec_meilleure_attaque()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(180, 120));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(false, est_vainqueur);
    }

    @Test
    public void test_pokemon1_gagne_avec_meilleure_defense_quand_attaque_egale()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(100, 90));
//WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(true, est_vainqueur);
    }

    @Test
    public void test_pokemon2_gagne_avec_meilleure_defense_quand_attaque_egale()
    {
        //GIVEN
        Pokemon leH = new Pokemon("leH", "leH.png", new Stats(100, 100) );
        Pokemon staline = new Pokemon("staline", "staline.png", new Stats(100, 190));

        //WHEN
        boolean est_vainqueur = leH.estVainqueurContre(staline);

        //THEN
        assertEquals(false, est_vainqueur);
    }

    @Test
    public void test_pokemon1_gagne_quand_meme_stats()
    {
        //GIVEN
        ConstructeurDePokemon test = ConstructeurDePokemon.unPokemon();
        test.avecAttaque(5000);
        test.avecDefense(5000);
        Pokemon leZ = test.construire();

        ConstructeurDePokemon test2 = ConstructeurDePokemon.unPokemon();
        test2.avecAttaque(5000);
        test2.avecDefense(5000);
        Pokemon Melenchon = test.construire();


        //WHEN
        boolean est_vainqueur = leZ.estVainqueurContre(Melenchon);

        //THEN
        assertEquals(true, est_vainqueur);

}
}