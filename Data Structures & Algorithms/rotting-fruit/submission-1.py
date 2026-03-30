class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        q = deque()
        time,fresh = 0,0
        rows, cols = len(grid), len(grid[0])
        
        def timeForRot(r,c):
            nonlocal fresh
            if r<0 or r==rows or c<0 or c==cols or grid[r][c] != 1 :
                return
            grid[r][c] = 2
            q.append((r,c))
            fresh -= 1 

        for r in range(rows):
            for c in range(cols):
                if grid[r][c] == 1:
                    fresh+=1
                if grid[r][c] == 2:
                    q.append((r,c))
        while fresh>0 and q:
            for i in range(len(q)):
                r,c=q.popleft()
                timeForRot(r+1,c)
                timeForRot(r-1,c)
                timeForRot(r,c+1)
                timeForRot(r,c-1)
            time+=1
        return time if fresh == 0 else -1