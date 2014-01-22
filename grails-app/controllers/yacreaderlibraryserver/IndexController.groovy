package yacreaderlibraryserver

class IndexController {

    def DirectoryWatcherService directoryWatcherService;

    def start() {
        directoryWatcherService.serviceMethod()

        render view:'test'
    }
}
