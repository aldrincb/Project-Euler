import re
numbers = [line.strip() for line in open('in.txt')]
sum = 0
for number in numbers:
	regex = re.compile("[0-9]{12}")
	r = regex.search(number)
	regex.match(number)
	regex.findall(number)[0]
	sum += int(regex.findall(number)[0])

regex = re.compile("[0-9]{10}")
r = regex.search(str(sum))
regex.match(str(sum))
print regex.findall(str(sum))[0]
