#include<iostream>
#include<math.h>
using namespace std;

class Animal {
	string raca;
	double peso;
	public:
	Animal(string raca, double peso) {
		this->raca = raca;
		this->peso = peso;
	}	
};

class Cachorro : Animal {
	public:
    void latir() {
		cout << "Au au";
	}
};

class Veiculo {
	public:
    void tipo() {
		cout << "O veiculo eh um carro ou moto";
	}
};

class Carro : Veiculo {
	public:
    void tipo(){
		cout << "O veiculo eh um carro";
	}
};

class Forma {
	int lados;
	public:
    Forma(int lados) {
		this->lados = lados;
	}
	virtual void desenha() = 0;
};

class Quadrado : Forma {
	public:
	void desenha() override {

    }

};

class Pessoa {
	string nome;
	int idade;
	public:
    void falar(string fala) {
		cout << fala;
	}
};

class Funcionario : Pessoa {
	double salario;
	public:
    double calcRendaAnual() {
		return salario * 12;
	}
};

class Mesa {
	string material;
	double area;
	public:
    Mesa(string material, double area) {
		this->material = material;
		this->area = area;
	}
};

class MesaQuadrada : Mesa{
	public:
    void cortaMesa(){

    }
};
