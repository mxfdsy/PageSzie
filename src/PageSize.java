/**
 * 需求 1、分页
 * Created by 平凡的世界 on 2018/3/20.
 * @author  没想法的岁月
 *
 */
public class PageSize {
    public static void main(String[] args) throws LogicExcepton {
        int totalPageSize = getTotalPage(11,0);
        System.out.println("分页数为 "+ totalPageSize);
    }
    private static int getTotalPage(int totalCount, int pageSize) throws LogicExcepton {
        if (totalCount > 0 && pageSize > 0) {
            return totalCount % pageSize == 0 ? totalCount / totalCount : totalCount / pageSize + 1;
        }else if (totalCount < 0 || pageSize <=0){
          throw new LogicExcepton("亲，PageSize不能小于等于0哦");
        }
        return  1;
    }
}
