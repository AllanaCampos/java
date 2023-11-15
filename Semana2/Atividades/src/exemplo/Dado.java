package exemplo;

import java.util.Random;

public class Dado {
	private int face;
	private final static int FACES = 6;
	public Dado() {
		rolar();
	}
	public int obterFace() {
		return this.face;
	}
	public void rolar() {
		Random random = new Random();
		this.face = random.nextInt(7) % FACES + 1;
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
	    d1.rolar();
	    System.out.println(d1.obterFace());
	}
}

/*#include <cstdlib>
#include <iostream>
#include <ctime>
using namespace std;

class Dado{
  private: //default
    int face;
  public:
    Dado(){srand(time(0));rolar();};
    const static int FACES=6;
    int obterFace();
    void rolar();
};

int Dado::obterFace(){return face;}
void Dado::rolar(){face=rand()%FACES + 1;}


int main(int argc, char *argv[])
{
    Dado d1;
    d1.rolar();
    cout<< d1.obterFace()<<"\n";
    system("PAUSE");
    return EXIT_SUCCESS;
}*/