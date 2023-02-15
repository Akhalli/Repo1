pipeline{
    agent any 
    stages {
        stage('git checkout') { 
            steps { 
                git branch: 'main', credentialsId: 'gitCreds', url: 'https://github.com/Akhalli/Repo1.git'
               
            }
        }
        stage('virtual env') { 
            steps { 
                 bat ''' 
                        python -m pip install -U pip --user 
                        pip install virtualenv
                        mkdir my_project1
                        cd my_project1
                        python -m virtualenv venv
                        venv/Scripts/activate.bat
                        pip install pytest
                        cd ../
                    '''   
                 
            }
        }
        stage('python bild stage') {
            steps {
                bat 'python calculator.py'
            }
        }
        stage('Unittest') {
            steps {
                bat 'python -m pytest -v unit_tests.py'
            }
        }
    }
}