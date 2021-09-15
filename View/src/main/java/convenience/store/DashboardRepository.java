package convenience.store;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {

    Dashboard findByReserveId(Long reserveId);
    List<Dashboard> findByCustomerId(Long customerId);

}