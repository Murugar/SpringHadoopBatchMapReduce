println "RESULTS from " + outputDir
old = new File('results.txt')
if( old.exists() ) {
    old.delete()
}
fsh.get(outputDir + '/part-r-*', 'results.txt');
String fileContents = new File('results.txt').text
println fileContents
