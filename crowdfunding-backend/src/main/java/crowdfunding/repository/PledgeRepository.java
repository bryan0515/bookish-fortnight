package crowdfunding.repository;

import crowdfunding.entity.Customer;
import crowdfunding.entity.Pledge;
import crowdfunding.entity.PledgeId;
import crowdfunding.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.Date;

/**
 * Created by bryancheng on 2017/5/6.
 */
public interface PledgeRepository extends JpaRepository<Pledge, PledgeId> {
    Collection<Pledge> findPledgeByPledgeIdRequestRequestIdProjectAndPledgeIdRequestRequestIdSttimeAndPledgeIdCustomerAndPledgeIdPledgetime(
            @Param("request.requestId.project") Project pid,
            @Param("request.requestId.sttime") Date sttime,
            @Param("customer") Customer customer,
            @Param("pledgetime") Date pledgetime);

    @Query(value=
            "SELECT p FROM Pledge p WHERE " +
            "LOWER(p.pledgeId.request.requestId.project.pid) = :pid AND " +
            "LOWER(p.pledgeId.request.requestId.sttime) = :sttime")
    Collection<Pledge> findPledgeByRequestParam(@Param("pid") long pid, @Param("sttime") Date sttime);

    @Query(value =
//        "SELECT p FROM Pledge p WHERE (cast(p.amount as double)/POW(10,p.amountPrecision)) < :amount")
        "SELECT p FROM Pledge p WHERE p.amount > :amount")
    Collection<Pledge> findPledgeByAmount(@Param("amount") float amount);
}
