
@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

    @RequestMapping("")
    public void basic() {
        log.info("basic..............");
    }
}

@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
public void basicGet() {
    log.info("basic get..............");
}

@GetMapping("/basicOnlyGet")
public void basicGet2() {
    log.info("basic get only get..............");
}