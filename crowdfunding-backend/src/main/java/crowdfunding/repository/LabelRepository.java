package crowdfunding.repository;

import crowdfunding.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by bryancheng on 2017/5/5.
 */
public interface LabelRepository extends JpaRepository<Label, String> {
}
