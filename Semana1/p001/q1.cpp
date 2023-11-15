#include<iostream>
#include<math.h>
using namespace std;

class Carro{
    string modelo;
    int ano;
    int numPortas;
    double velocidade;
    public:
    Carro(string m, int a, int n){
        this->modelo = m;
        this->ano = a;
        this->numPortas = n;
        this->velocidade = 0;
    }
    void atualizarVelocidade(double v){
        this->velocidade = v;
    }
};

class Ponto{
    double x;
    double y;
    public:
    Ponto(double x, double y){
        this->x = x;
        this->y = y;
    }

    float calcDistancia(){
        double d;
        d = sqrt(pow(this->x, 2) + pow(this->y, 2));
        return d;
    }
};

class Triangulo{
    double b;
    double a;
    double h;
    public:
    Triangulo(double b, double a, double h){
        this->b = b;
        this->a = a;
        this->h = h;
    }
    string getTipo(){
        if(b == a && a == h)
            return "equilatero";
        if(b != a && a!= h && b != h)
            return "escaleno";
        return "isosceles";
    }

};

class Planta{
    string nome;
    string cor;
    public:
    Planta(string nome, string cor){
        this->nome = nome;
        this->cor = cor;
    }
    void fazerFotossintese(){}

};

class Casa{
    string endereco;
    float area;
    public:
    Casa(string endereco, float area){
        this->endereco = endereco;
        this->area = area;
    }
    void addParede(){}
};

int main(){
    Carro *c1 = new Carro("Tracker", 2022, 4);
    Ponto *p1 = new Ponto(1.2, 2.4);
    Triangulo *t1 = new Triangulo(5, 5, 9);
    Planta *pl1 = new Planta("rosa", "vermelha");
    Casa *ca1 = new Casa("rua das margaridas", 1000);
}
