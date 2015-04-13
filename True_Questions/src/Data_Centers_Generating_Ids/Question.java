package Data_Centers_Generating_Ids;

public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * twitter onsite
	 * http://www.mitbbs.com/article_t/JobHunting/32932495.html
	 * 多个datacenter怎么生成unique的内容id要求时间相近id相近
	 */
	
	/**
	 * 自己想的
	 * 1.有一个中央server，用作创建保存和查询id为了防止single point failure可以再多一个copy server）。
	 * 2.每当任何一个data center新产生一个item需要id的时候，send request to "id server"(IS)
	 * 3.request到达IS之后先放入队列。产生id的过程是同步的，要加锁(lock可以采用semaphore机制)。每次从队头取一个放入getId()函数中(getId函数里可以只简单的count++)
	 * 4.将产生的item和其对应的id放入IS的HashMap中，以备之后查询
	 * 
	 * 或者 IS只负责产生 不负责存储id
	 * 产生id之后便把id返回给request的data center
	 * 
	 * 讨论利弊
	 */

}
