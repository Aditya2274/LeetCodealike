function combine(n: number, k: number): number[][] {
    const ans: number[][] =[];
    helper(1,n,k,[],ans);
    return ans;
};
function helper(
    start:number,
    n:number,
    k:number,
    curr:number[],
    ans:number[][]
): void{
    if(curr.length==k){
        ans.push([...curr]);
        return;
    }
    for(let i:number=start;i<=n;i++){
        curr.push(i);
        helper(i+1,n,k,curr,ans);
        curr.pop();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna