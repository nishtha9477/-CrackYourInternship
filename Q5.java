// Chocolate Distribution Problem(gfg)

 public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        
        // Initialize the minimum difference to a large value
        long min_diff = Long.MAX_VALUE;
        
        // Traverse the vector to find the minimum difference between max and min chocolates
        for (int i = 0; i + m - 1 < n; i++) {
            long diff = a.get(i + (int)m - 1) - a.get(i);
            if (diff < min_diff) {
                min_diff = diff;
            }
        }
        
        return min_diff;
    }

