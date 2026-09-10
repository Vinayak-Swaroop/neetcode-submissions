class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Car[] cars = new Car[position.length];
        for(int i=0;i<position.length;i++){
            float time = (target-position[i])/(speed[i]*1.0f);
            Car car = new Car(position[i],speed[i],time);
            cars[i]=car;
        }
        Arrays.sort(cars,(c1,c2)->Integer.compare(c2.position,c1.position));
        Stack<Car> stack = new Stack();
        stack.push(cars[0]);
        for(int i=1;i<cars.length;i++){
            if(cars[i].time<=stack.peek().time)
                continue;
            stack.push(cars[i]);
        }
        return stack.size();
    }
}
class Car
{
    int position;
    int speed;
    float time;
    Car(int position,int speed,float time){
        this.position = position;
        this.speed = speed;
        this.time = time;
    }
}
