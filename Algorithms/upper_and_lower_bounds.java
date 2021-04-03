public class UpperAndLowerBound {
    
  
    //provides first index in A[0,last) whose value is greater than B, if no such index found then return last
    public int upperBound(List<Integer> A, int B) {
        
        int mid;
        int l = 0;
        int r = A.size() - 1;
        
        while(l<r){
            mid = l + (r - l)/2;
            if(A.get(mid) <= B) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
        }
        
        if(A.get(r)<=B) {
            return r + 1;    
        }
        return r;
    }
    
    //provides first index in A[0,last) whose value is not less than B, if no such index is found then return last
    public int lowerBound(List<Integer> A, int B) {
        
        int mid;
        int l = 0;
        int r = A.size() - 1;
        
        while(l<r) {
            mid = l + (r - l)/2;
            if(A.get(mid) >= B) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }
        
        if(A.get(r) < B) {
            return l + 1;
        }
        return l;
    }
}
