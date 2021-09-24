package io.javabrains;

import io.micrometer.core.ipc.http.HttpSender.Response;

@Controller
public class PlantDairyController {

	
	private Specimen specimen;

	@RequestMapping("/")
	public String index() {
		return "start";
	}
	
	
	@GetMapping("/specimen")
	public Response fetchAllSpecimen() {
		return new Response(HttpStatus.OK);
	}
	
  @PostMapping(value="/specimen", consumes="application/json", produces="application/json")
  public Specimen createSpecimen(@RequestBody Specimen specimen)
     return specimen;
}
