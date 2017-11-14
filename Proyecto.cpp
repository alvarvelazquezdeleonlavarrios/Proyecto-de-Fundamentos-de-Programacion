#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void solicitudes();
void impresiones();

int a,x;

	struct datos
	{
		char name[12];
		char ape1[16];
		char ape2[16];
		char direc[101];
		char tel[15];
	};
struct datos contacto[501];
FILE *fichero;

int main()
{
	printf("\t\t\tDIRECTORIO\n\n\n");
	printf("El numero de contactos: ");
	scanf("%d",&x);
	
	if((fichero=fopen("Directorio.txt","w+"))==NULL)
	{
		printf("No se puede abrir el archivo. \n");
	}
	else
	{
		for(a=1; a<=x; a++)
		{
			solicitudes();
		}
		impresiones();
		fclose(fichero);
	}
	printf("\nTus datos se guardaron\n");
	system("pause");
	return 0;
}

void solicitudes()
{
	printf("Nombre %d: ",a);
	scanf("%s",&contacto[a].name);
	strupr(contacto[a].name);
	
	printf("Apellido Paterno %d: ",a);
	scanf("%s",&contacto[a].ape1);
	strupr(contacto[a].ape1);
	
	printf("Apellido materno %d: ",a);
	scanf("%s",&contacto[a].ape2);
	strupr(contacto[a].ape2);
	
	printf("Direccion %d (se escribe sin espacios): ",a);
	scanf("%s",&contacto[a].direc);
	strupr(contacto[a].direc);
	
	printf("Telefono %d: ",a);
	scanf("%s",&contacto[a].tel);
	printf("\n");
}

void impresiones()
{
	fprintf(fichero,"\t\tDIRECTORIO\n\n");
	for(a=1; a<=x; a++)
	{
		fprintf(fichero, "Nombre %d: %s %s %s\n",a, contacto[a].name, contacto[a].ape1, contacto[a].ape2);
		fprintf(fichero, "Direccion %d: %s\n",a, contacto[a].direc);
		fprintf(fichero, "Telefono %d: %s\n",a, contacto[a].tel);
		fprintf(fichero, "\n");
	}
}
