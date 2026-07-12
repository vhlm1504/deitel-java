/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deitel.java.cap10;

/**
 *
 * @author victormendonca
 */
public class PayrollSystemTest {
    
    public static void main(String[] args)
    {
        SalariedEmployee assalariado;
        
        //criando os objetos das subclasses
        try{
        assalariado = new SalariedEmployee("Edi", "Mendonca", "111-11-1111", 2500.00);
        HourlyEmployee horista = new HourlyEmployee("Khan", "Mendonca", "222-22-2222", 45.00, 168.0);
        CommissionEmployee comissionado = new CommissionEmployee("Pantera", "Mendonca", "333-33-3333", 15000, .1);
        BasePlusCommissionEmployee assalariadoComComissao = new BasePlusCommissionEmployee("Quiu", "Mendonca", "444-44-4444", 5000.5, .1, 2500.0);
        
        System.out.printf("Employee processed individually: ");
        
        System.out.printf("%n%s%n%s: $%,.2f%n%n", assalariado.toString(), "earned", assalariado.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", horista, "earned", horista.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", comissionado, "earned", comissionado.earnings());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", assalariadoComComissao, "earned", assalariadoComComissao.earnings());
        
        Employee[] employees = new Employee[4];
        
        employees[0] = assalariado;
        employees[1] = horista;
        employees[2] = comissionado;
        employees[3] = assalariadoComComissao;
        
        System.out.println("Employees processed polymorphically:");
        
        //processamento genérico for-each
        for(Employee currentEmployee : employees) //é possível fazer com classes mais altas na hirerarquia mas não ao contrário, não seria possível usar uma variável do tipo de uma das subclasses para acessar o array, neste caso só com a superclasse comum a todos é possível 
        {
            System.out.printf("%s%n%n%n", currentEmployee.toString());
            
            if(currentEmployee instanceof BasePlusCommissionEmployee)
            {
                //downcast Employee reference to BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;//o cast é necessário para que se possa invocar os métodos da subclasse BasePlusCommissionEmployee, não é possível fazê-lo se apoiando numa variável de referência do tipo da superclasse, que neste caso é um objeto Employee
                employee.setBaseSalary(1.1 * employee.getBaseSalary()); //como agora employee tem a mesma referência ao objeto assalariadoComComissao, é possível alterar um atributo usando a nova variável guardando sua referência.
                
                System.out.printf("New base salary with 10%% increase is: %,.2f%n", employee.getBaseSalary());
            }
        }
        //pegar o nome do tipo de cada objeto no array employees
            int lenght = employees.length;
            for(int j = 0; j < lenght; j++)
            {
                System.out.printf("Employee %d is a %s%n%n", j, employees[j].getClass().getName());
            }
        
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("%s%n", e.getMessage());
        }
        
                
    }
    
}
