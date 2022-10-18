#include <stdio.h>
#include <math.h>
int main()
{
FILE *fptr;
fptr=fopen("student.txt","w");
 char name[100];
 int  age;
 float markPrcnt;
printf("Enter the student name");
scanf("%s",&name);
printf("Enter the student age");
scanf("%d",&age);
printf("Enter the student mark percentage");
scanf("%f",&markPrcnt);
fprintf(fptr,"Student name=%s\n",name);
fprintf(fptr,"Student age=%d\n",age);
fprintf(fptr,"Student mark prct=%f\n",markPrcnt);

fclose(fptr);
  return 0;
}
