<p>Given two strings <code>s</code> and <code>t</code>, return <em>the number of distinct subsequences of <code>s</code> which equals <code>t</code></em>.</p>

<p>A string's <strong>subsequence</strong> is a new string formed from the original string by deleting some (can be none) of the characters without disturbing the remaining characters' relative positions. (i.e., <code>"ACE"</code> is a subsequence of <code>"ABCDE"</code> while <code>"AEC"</code> is not).</p>

<p>The test cases are generated so that the answer fits on a 32-bit signed integer.</p>

<p>&nbsp;</p> 
<p><strong>Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "rabbbit", t = "rabbit"
<strong>Output:</strong> 3
<strong>Explanation:</strong>
As shown below, there are 3 ways you can generate "rabbit" from s.
<span><code><strong><u>rabb</u></strong>b<strong><u>it</u></strong></code></span>
<span><code><strong><u>ra</u></strong>b<strong><u>bbit</u></strong></code></span>
<span><code><strong><u>rab</u></strong>b<strong><u>bit</u></strong></code></span>
</pre>

<p><strong>Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "babgbag", t = "bag"
<strong>Output:</strong> 5
<strong>Explanation:</strong>
As shown below, there are 5 ways you can generate "bag" from s.
<span><code><strong><u>ba</u></strong>b<u><strong>g</strong></u>bag</code></span>
<span><code><strong><u>ba</u></strong>bgba<strong><u>g</u></strong></code></span>
<span><code><u><strong>b</strong></u>abgb<strong><u>ag</u></strong></code></span>
<span><code>ba<u><strong>b</strong></u>gb<u><strong>ag</strong></u></code></span>
<span><code>babg<strong><u>bag</u></strong></code></span></pre>

<p>&nbsp;</p> 
<p><strong>Constraints:</strong></p>

<ul> 
 <li><code>1 &lt;= s.length, t.length &lt;= 1000</code></li> 
 <li><code>s</code> and <code>t</code> consist of English letters.</li> 
</ul>

<div><div>Related Topics</div><div><li>String</li><li>Dynamic Programming</li></div></div><br><div><li>👍 4326</li><li>👎 176</li></div>