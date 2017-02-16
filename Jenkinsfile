node{
stage 'CHECKOUT'   

echo 'Hello World' 

checkout([$class:'GitSCM', branches:[[name:'*/master']], 
doGenerateSumoduleConfigurations: false, extensions: [],
submoduleCfg:[], userRemoteConfigs:[[credentialssId: 
'Djordan-15', url:'https://github.com/Djordan15/goCubsGo.git']]])

stage 'BUILD'
def mvnHome= tool 'M3'
shell "${mvnHome}/bin/mvn -B verify"
echo 'hello from build stage'    

stage 'FINISHED'    
echo 'last stage'

}
