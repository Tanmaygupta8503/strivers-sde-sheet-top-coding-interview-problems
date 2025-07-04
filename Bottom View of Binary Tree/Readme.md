<h1>Bottom View of Binary Tree</h1>
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">Given a binary <strong>tree</strong>, return an array where elements represent the bottom view of the binary tree from left to right.</span></p>
<p><span style="font-size: 14pt;">Note: If there are <strong>multiple </strong>bottom-most nodes for a horizontal distance from the root, then the <strong>latter </strong>one in the level traversal is considered. For example, in the below diagram, 3 and 4 are both the bottommost nodes at a horizontal distance of 0, here <strong>4</strong> will be considered.</span></p>
<p><span style="font-size: 14pt;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 20<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp;&nbsp; \<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 8&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 22<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; /&nbsp;&nbsp; \&nbsp;&nbsp; &nbsp; /&nbsp;&nbsp; \<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 3 4&nbsp;&nbsp;&nbsp;&nbsp; 25<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; &nbsp;&nbsp;&nbsp; /&nbsp; &nbsp; \&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 10 &nbsp;&nbsp; &nbsp;&nbsp; 14</span></p>
<p><span style="font-size: 14pt;">For the above tree, the output should be 5 10 <strong>4</strong> 14 25.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples :</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input:
</strong>       1
&nbsp;    /   \
&nbsp;   3     2
<strong>Output: </strong>3 1 2<strong>
Explanation: </strong>First case represents a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 3 and right child of 1 is 2.
<img src="https://contribute.geeksforgeeks.org/wp-content/uploads/BT-1.jpg" alt="" width="400" height="202">
Thus bottom view of the binary tree will be 3 1 2.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:
</strong>         10
&nbsp;      /    \
&nbsp;     20    30
&nbsp;    /  \
&nbsp;   40   60
<strong>Output: </strong>40 20 60 30</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input:
</strong>        1
&nbsp;      /   
&nbsp;     2
<strong>Output: </strong>2 1</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= number of nodes &lt;= 10<sup>5</sup><br>1 &lt;= node-&gt;data &lt;= 10<sup>5</sup></span></p></div>
