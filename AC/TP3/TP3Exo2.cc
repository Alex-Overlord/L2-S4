#include <cstdlib>
#include <iostream>
#include <fstream>
#include <string>
#include <cmath>

#include "AffichageMaisons.h"

#define dcouv 100

void GenererMaisons(int n, int coordMaisons[][2])
{
  for(int i=0 ; i<n ; i++)
  {
    coordMaisons[i][0] = 10 + rand() % 593;
    coordMaisons[i][1] = 10 + rand() % 773;
  }
}

void Initialiser(int n, int a[])
{
  for(int i=0 ; i<n ; i++) 
  {
    a[i] = 0;
  }
}

bool Couvre(int i, int j, const int coordMaisons[][2])
{ // racine(puiss2(x1 - x2) + puiss2(y1 - y2))
  int X = (coordMaisons[i][0] - coordMaisons[j][0]);
  int Y = (coordMaisons[i][1] - coordMaisons[j][1]);
  return sqrt(pow(X,2) + pow(Y,2)) <= dcouv;
}

// Retourne l'indice de la maison qui couvre le plus de maisons voisines
int ChoixProchaineMaison(int n, const int coordMaisons[][2], int dejaCouvertes[])
{ 
  

	// int i_max = 0; // indice maison avec le max de maison qu'elle peut couvrir
	// int nb_max = 0; // nombre max qu'une maison peut couvrir
	// for (int i=0 ; i<n ; i++) // pour la ième maison
  // {
	// 	int cpt = 0; // nombre de maison qu'elle couvre
	// 	for (int j=0 ; j<n ; j++)
	// 	{
	// 		if (i != j && Couvre(i, j, coordMaisons)) // si pas les mêmes maisons et qu'elle couvre
	// 		{
	// 			cpt++;
	// 		}
	// 	}
	// 	if (cpt > nb_max) // si meilleur choix
	// 	{
	// 		i_max = i;
	// 		nb_max = cpt;
	// 	}
  // }
  // for (int k=0 ; k<n ; k++) // mets à 1 les maisons couverte par la maison choisie
  // {
  //   if (Couvre(i_max, k, coordMaisons))
  //   {
  //     dejaCouvertes[k] = 1;
  //     dejaCouvertes[n+1]++;
  //   }
  // }
	// return i_max;
}

// Rempli le tableau des emetteurs 
int ChoixEmetteurs(int n, const int coordMaisons[][2], int emetteurs[])
{
	//int dejaCouvertes[n+1] = {0}; // tableaux de 0 et 1 avec le nb de maisons couverte en n+1
	// int i = 0;
	// int nb_emetteurs = 0;
	// while (dejaCouvertes[n+1] < n) // tant qu'il reste des maisons non couvertes
	// {
	// 	// indice de la maison qui couvre le plus de maison
	// 	i = ChoixProchaineMaison(n, coordMaisons, dejaCouvertes); 
	// 	emetteurs[i] = 1;
  //   i += 1;
  //   nb_emetteurs++;
	// }
  // return nb_emetteurs;

  int dejaCouvertes[n+1];
  Initialiser(n+1, dejaCouvertes);
  int nbEmetteurs = 0;

  while (dejaCouvertes[n] < n)
  {
    int nvleMaison = ChoixProchaineMaison(n, coordMaisons, dejaCouvertes);
    emetteurs[nvleMaison] = 1;
    nbEmetteurs++;
    for (int j=0 ; j<n ; j++)
    {
      if (dejaCouvertes[j] == 0 && Couvre(nvleMaison, j, coordMaisons))
      {
        dejaCouvertes[j] = 1;
        dejaCouvertes[n]++;
      }
    }
  }
  return nbEmetteurs;
}

int suivant(int n, int tab[])
{
  int i = 0;
  while (i < n and tab[i] == 1) 
  {
    tab[i++]  = 0;
  }
  if (i == n) 
  {
    return 1;
  }
  tab[i] = 1;
  return 0;
}

int ChoixEmetteursOpt(int n, const int coordMaisons[][2], int emetteurs[])
{
  //
  // A COMPLETER
  //
  return 0;
}

int main(int argc, char** argv)
{
  int n;
  if (argc < 2)
  {
    cout << "Entrer le nombre de maisons: ";
    cin >> n;
  }
  else
  {
    n = atoi(argv[1]);
  }
  
  srand(time(NULL));

  int coordMaisons[n][2]; // coordonnées des maisons dans le plan
  int emetteurs[n];       // numéro des maisons que l'on choisit pour placer des émetteurs
  //int dejaCouvertes[n+1] = {0};

  GenererMaisons(n, coordMaisons);
  AffichageMaisons(n, coordMaisons, "Maisons");
  Initialiser(n, emetteurs);

  int nbEmetteurs = ChoixEmetteurs(n, coordMaisons, emetteurs);
  cout << "Nombre d'émetteurs placés : "<< nbEmetteurs << endl;
  AffichageMaisonsEmetteurs(n, coordMaisons, emetteurs, "Emetteurs");

  // int emetteursOpt[n];
  // Initialiser(n, emetteursOpt);
  // int nbEmetteursOpt = ChoixEmetteursOpt(n, coordMaisons, emetteursOpt);
  // cout << "Nombre d'émetteurs optimal : " << nbEmetteursOpt << endl;
  // AffichageMaisonsEmetteurs(n, coordMaisons, emetteursOpt, "EmetteursOpt");

  return 0;
}

#undef dcouv