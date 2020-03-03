#include "TP4.h"

static int npivot = 0;

enum pivot { FIXE, ALEATOIRE };

int choixPivot(int n, int T[], pivot P) 
{
  npivot++;
  switch (P)
  {
    case FIXE:
      return 0;
      break;
    case ALEATOIRE:
      return rand() % n; // A modifier 
      break;
  }
}

int rang(int k, int n, int T[], pivot P)
{
  if (n == 1) return T[0];
  int p = choixPivot(n, T, P);
  int n_inf = 0; // nombres d'entier inférieur au pivot
  int n_eq = 0; // nombres d'entier égal au pivot
  int r; // résultat renvoyé

  // Complété : calcul de n_inf et n_eq
  for (int i=0; i<n-1; i++)
  {
    if (T[i] < T[p]) n_inf++;
    else if (T[i] == T[p]) n_eq++;
  }

  if (k <= n_inf) 
  {
    // A compléter : cas 1
    int* T_inf = (int*) malloc(n_inf * sizeof(int));
    int ind_inf = 0;

    for (int i=0; i<n; i++) // Calcul de T_inf
    {
      if (T[i] < T[p])
      {
        T_inf[ind_inf++] = T[i];
      }
    }

    r = rang(k, n_inf, T_inf, P); // Renvoyer rang(T_inf, k)
    free(T_inf);
    return r;
  }

  else if (n_inf + n_eq >= k) 
  {
    // Complété : cas 2

    return T[p];
  }

  else
  {
    // complété : cas 3
    int n_sup = n-n_inf-n_eq;
    int* T_sup = (int*) malloc((n_sup) * sizeof(int));
    int ind_sup = 0;
    
    for (int i=0; i<n; i++) // Calcul de T_sup
    {
      if (T[i] < T[p])
      {
        T_sup[ind_sup++] = T[i];
      }
    }

    r = rang(k, n_sup, T_sup, P);  // Renvoyer rang(T_inf, k)
    free(T_sup);
    return r;
  }
}

int main(int argc, char** argv)
{

  srand(time(NULL));
  int n = 0;
  //if (argc > 1) n = atoi(argv[1]);
  int* tab = RemplirTableau(n, argc, argv);  

  cout<<"Tableau de depart:"<<endl;
  AfficherTableau(n,tab);

  int k = 0;
  while(k<1 || k>n)
  {
    cout << "Rang à calculer (entre 1 et " << n << ") : ";
    cin >> k;
  }

  clock_t avant;
  clock_t apres;

  int r;
  
  cout << "Nombre de rang " << k << " :" << endl;
  cout << "  pivot fixe : ";
  npivot = 0; avant = clock(); r = rang(k, n, tab, FIXE); apres = clock();
  cout << r << " (nb pivots: " << npivot << ", temps: " << (double)(apres-avant)/CLOCKS_PER_SEC << "s)" << endl;

  cout << "  pivot aléatoire : ";
  npivot = 0; avant = clock(); r = rang(k, n, tab, ALEATOIRE); apres = clock();
  cout << r << " (nb pivots: " << npivot << ", temps: " << (double)(apres-avant)/CLOCKS_PER_SEC << "s)" << endl;

  free(tab);
}