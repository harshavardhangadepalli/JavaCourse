public class ConstructorsChallenge {
    public static void main(String[] args) {
        Wall w = new Wall();
        System.out.println(w.getArea());
    }
    public static class Wall {
        private double width;
        private double height;

        public Wall() {
            this.height = 0;
            this.width = 0;
        }

        public Wall(double w, double h) {
            if(h < 0)
                this.height = 0;
            if (w < 0)
                this.width = 0;
            if (h > 0)
                this.height = h;
            if (w > 0)
                this.width = w;
        }

        public double getWidth() {
            return this.width;
        }

        public double getHeight() {
            return this.height;
        }

        public void setWidth(double w) {
            if (w < 0) {
                this.width = 0;
                return;
            }
            this.width = w;
        }

        public void setHeight(double h) {
            if (h < 0) {
                this.height = 0;
                return;
            }
            this.height = h;
        }

        public double getArea() {
            return this.height * this.width;
        }

    }

    public static class Point {
        private int x;
        private int y;

        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance(Point p1, Point p2) {
            return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
        }
    }
}
