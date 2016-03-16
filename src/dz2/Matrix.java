/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package dz2;
/**
 *
 * @author Aslan
 */

package dz2;
public class Matrix
{
    int m,n;
    int [][] matrix;
    
    public Matrix()
    {
        this(3, 3);        
    }

    public Matrix(int m,int n)
    {
        this.m=m;
        this.n=n;
        matrix=new int[m][n];
        this.Init();
        
    }
    public int GetM()
    {
        return this.m;
    }
    public int GetN()
    {
        return this.n;
    }
    public int[][] GetMatrix()
    {
        return this.matrix;
    }   
    
    public void Init()
    {
        java.util.Random r=new java.util.Random();
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
            {
                this.matrix[i][j]=r.nextInt();
                        
                        
            }
        }
    }
    
    
    
    public Matrix Add(Matrix matrix)
    {
        Matrix _newMatrix=new Matrix(this.m,this.n);
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
            {
                _newMatrix.GetMatrix()[i][j]=this.GetMatrix()[i][j]+ matrix.GetMatrix()[i][j];
            }
        }
        return _newMatrix;
    }
    
    public Matrix Sub(Matrix matrix)
    {
        Matrix _newMatrix=new Matrix(this.m,this.n);
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
            {
                _newMatrix.GetMatrix()[i][j]=this.GetMatrix()[i][j]- matrix.GetMatrix()[i][j];
            }
        }
        return _newMatrix;
    }
    
    public Matrix Mult(Matrix matrix)
    {
        Matrix _newMatrix=new Matrix(this.m,this.n);
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
            {
                _newMatrix.GetMatrix()[i][j]=this.GetMatrix()[i][j]* matrix.GetMatrix()[i][j];
            }
        }
        return _newMatrix;
    }
    
    public Matrix Div(Matrix matrix)
    {
        Matrix _newMatrix=new Matrix(this.m,this.n);
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
            {
                _newMatrix.GetMatrix()[i][j]=this.GetMatrix()[i][j]/ matrix.GetMatrix()[i][j];
            }
        }
        return _newMatrix;
    }
    
   
    
    
    @Override
    public String toString()
    {
      String str="";
        for (int i = 0; i < this.m; i++)
        {
            for (int j = 0; j < this.n; j++)
            {
              str+=this.GetMatrix()[i][j]+" ";
            }
            str+="\n";
        }
        str+="###########################";
        return str;
    }
    
    
   
}
