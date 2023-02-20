def command = "pytest -v unit_tests.py"
def processBuilder = new ProcessBuilder(command.split())
def process = processBuilder.start()
process.waitFor()
