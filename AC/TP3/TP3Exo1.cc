#include <cstdlib>
#include <iostream>
#include <fstream>

using namespace std;

// Fonctions fournies :

void InitialiserCours(int n, int a[][2]) 
{
  for(int i=0;i<n;i++) {
    a[i][0]=0;
    a[i][1]=0;
  }
}

void AfficherCours(int n, int cours[][2]) 
{
  for(int i=0;i<n;i++)
    cout << "[" << cours[i][0] << "," << cours[i][1] << "] ";
}  

// Fonctions à compléter :

void GenererCours(int n, int cours[][2]) 
{
  for (int i=0 ; i<n ; i++) {
    cours[i][0] = rand() % 90 + 1;
    cours[i][1] = cours[i][0] + (rand() % 10) + 1;
  }
}

void TrierCours(int n, int cours[][2]) 
{
  int tmp_debut;
  int tmp_fin;
  for (int i=n ; i>1 ; i--) {
    for (int j=0 ; j<n ; j++) {
      if (cours[j+1][1] < cours[j][1]) {
        tmp_debut = cours[j][0];
        tmp_fin = cours[j][1];
        cours[j][0] = cours[j+1][0];
        cours[j][1] = cours[j+1][1];
        cours[j+1][0] = tmp_debut;
        cours[j+1][1] = tmp_fin;
      }
    }
  } 
}

int ChoixCoursGlouton(int n, int cours[][2], int choix[][2]) 
{
  TrierCours(n, cours);
  int c = 1;
  int f = cours[0][1];
  choix[0][0] = cours[0][0];
  choix[0][1] = cours[0][1];

  for (int i=1 ; i<n ; i++) {
    if (cours[i][0] >= f) {
      f = cours[i][1];
      choix[c][0] = cours[i][0];
      choix[c][1] = cours[i][1];
      c++;
    }
  }

  return c;
}

// int n = 0;
// int instants[n];

// int Alarmes(int n, int cours[][2]) 
// {
//   int indice = 0;
//   instants[indice] = cours[0][1];
//   for (int i=1; i<n ; i++) {
//     if (cours[i][0] > instants[indice]) {
//       instants[++indice] = cours[i][1];
//     }
//     return indice+1;
//   }
// }

// Tests:

int main() 
{
  srand(time(NULL));

  // cout << "  Entrer le nombre de cours : ";
  // cin >> n;
  // int cours[n][2];
  // InitialiserCours(n, cours);

  // int n2 = 10;
  // int cours2[n2][2]={{76,78},{12,17},{13,15},{19,28},{12,20},{43,45},{44,45},{1,8},{68,78},{85,88}};

  // int choix2[n2][2];
  // int nbCours2 = ChoixCoursGlouton(n2, cours2, choix2);

  // int nbAlarmes = Alarmes(n2, cours2);
  // cout << "  Nombre d'alarmes : " << nbAlarmes << endl;
  // AfficherCours(n2, cours2);
  // cout << endl;

  // Test cours aléatoires :
  
  // cout << "Test cours aléatoires :" << endl;
  
  // GenererCours(n, cours);
  // cout << "  Cours non tries : ";
  // AfficherCours(n, cours);
  // cout << endl;

  // TrierCours(n,cours);
  // cout << "  Cours triés par dates de fin croissantes : ";
  // AfficherCours(n,cours);
  // cout << endl;

  // int choix[n][2];
  // int nbCours = ChoixCoursGlouton(n,cours,choix);
  // cout << "  Nombre de cours choisis : " << nbCours << endl;
  // cout << "  Liste des cours choisis :";
  // AfficherCours(nbCours,choix);
  // cout << endl << endl;

  // Test non aléatoire

  // cout << "Test non aléatoire :" << endl;

  // int n2 = 10;
  // int cours2[n2][2]={{76,78},{12,17},{13,15},{19,28},{12,20},{43,45},{44,45},{1,8},{68,78},{85,88}};
  
  // cout << "  Cours non tries : ";
  // AfficherCours(n2, cours2);
  // cout << endl;

  // TrierCours(n2, cours2);
  // cout << "  Cours triés par dates de fin croissantes : ";
  // AfficherCours(n2, cours2);
  // cout << endl;

  // cout << "  Nombre de cours choisis : " << nbCours2 << endl;
  // cout << "  Liste des cours choisis :";
  // AfficherCours(nbCours2, choix2);
  // cout << endl << endl;
 
}