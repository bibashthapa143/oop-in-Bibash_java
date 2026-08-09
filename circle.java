class circle implements shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area(){
        return 3.14*radius*radius;
    }
    @Override
    public double perimeter(){  
        
        return 2*3.14*radius;
    }   



}