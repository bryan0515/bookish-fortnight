package crowdfunding.repository;

import crowdfunding.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bryancheng on 2017/5/3.
 */
public interface LabelRepository extends JpaRepository<Label, String>{
}
