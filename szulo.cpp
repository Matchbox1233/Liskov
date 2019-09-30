#include <iostream>
using namespace std;
// szulo osztály, ebből fogom származtatni a leszarmaztatott osztályt.
class szulo {
public:
       void uzenet() {cout<<"Az ős üzenete\n";}
};
//ez a függvény kapja meg paraméterként a szulo&
void fgv ( szulo& os ) {
          os.uzenet();
}
// gyerek osztály szulo-ből származtatva
class gyerek : public szulo
{
	public: void uzenet() {cout<<"Az gyerek üzenete\n";}
	};
int main ( int argc, char **argv )
{
     szulo* szulo1 = new gyerek();
     szulo1->uzenet(); //az ős üzenete
     
     gyerek gyerek1;
     fgv(gyerek1); //az ős üzenete
}
