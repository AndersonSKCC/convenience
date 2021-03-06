package convenience.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	DashboardRepository dashboardRepository;
	
	@GetMapping("/list")
	public ResponseEntity<List<Dashboard>> getDashboards() {
		List<Dashboard> dashboardList = dashboardRepository.findAll();
		return ResponseEntity.ok(dashboardList);
	}
	
	@GetMapping("/list/{userId}")
	public ResponseEntity<List<Dashboard>> getDashboardsByUserId(@PathVariable Long userId) {
		List<Dashboard> dashboardList = dashboardRepository.findByCustomerId(userId);
		return ResponseEntity.ok(dashboardList);
	}
	
}
