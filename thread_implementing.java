class thread_implementing implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        thread_implementing newnImplementing = new thread_implementing();
        Thread nws = new Thread(newnImplementing);

        nws.start();

    }

}
