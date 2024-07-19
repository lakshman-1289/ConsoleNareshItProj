package com.courses;

import java.util.Arrays;

import com.common.CommonToCourses;

//class used to load Trainers data and their timings
public class TrainersData implements CommonToCourses,FullStackDataScience,JavaFullStack,DotNetFullStack,PythonFullStack,UIFullStack
{
	static {
		// "7:30am" "9:30am"  "11:30am"  "2:15pm"  "4:15pm"  "6:15pm"  "8:15pm" 
		//Java Trainers
		cjf.put("Kishan B",Arrays.asList("7:30am","4:15pm"));
		cjf.put("Venkatesh Maipathii",Arrays.asList("7:30am","4:15pm"));
		cjf.put("Venkatesh Mansani",Arrays.asList("7:30am","4:15pm"));
		cjf.put("N Rao",Arrays.asList("7:30am","4:15pm"));
		course.put(java1, cjf );
		
		ojf.put("Shiva Chaitanya",Arrays.asList("9:30am","6:15pm"));
		ojf.put("Sharma",Arrays.asList("9:30am","6:15pm"));
		ojf.put("Vijaya Kumar",Arrays.asList("9:30am","6:15pm"));
		course.put(java2, ojf );
		
		hjf.put("Prasad",Arrays.asList("11:30am","2:15pm"));
		hjf.put("Durga Prasad",Arrays.asList("11:30am","2:15pm"));
		hjf.put("Shiva Kumar",Arrays.asList("11:30am","2:15pm"));
		course.put(java3, hjf );
		
		
		ajf.put("Hari Krishna",Arrays.asList("11:30am","6:15pm"));
		ajf.put("Venkatesh Maipathii",Arrays.asList("11:30am","6:15pm"));
		ajf.put("Venkatesh Mansani",Arrays.asList("11:30am","6:15pm"));
		course.put(java4, ajf );
		
		rjf.put("Sudhakar Sharma",Arrays.asList("7:30am","4:15pm"));
		rjf.put("Sanjay",Arrays.asList("7:30am","4:15pm"));
		course.put(java5, rjf);
		
		sjf.put("Nataraj",Arrays.asList("9:30am","8:15pm"));
		sjf.put("Murthy",Arrays.asList("9:30am","8:15pm"));
		course.put(java6, sjf );
		
		djf.put("Nataraj",Arrays.asList("11:30am","6:15pm"));
		djf.put("Prasnath",Arrays.asList("11:30am","8:15pm"));
		course.put(java7, djf );
		
		//.NET Trainers
		cdf.put("Bangar Raju",Arrays.asList("7:30am","4:15pm"));
		cdf.put("Prakash",Arrays.asList("7:30am","4:15pm"));
		cdf.put("Sudhakar L",Arrays.asList("7:30am","4:15pm"));
		course.put(net1, cdf );
		
		odf.put("Vijaya Kumar",Arrays.asList("9:30am","6:15pm"));
		odf.put("Sharma",Arrays.asList("9:30am","6:15pm"));
		course.put(net2, odf );
		
		hdf.put("Srinu",Arrays.asList("11:30am","2:15pm"));
		hdf.put("Sagar",Arrays.asList("11:30am","2:15pm"));
		hdf.put("Shiva Kumar",Arrays.asList("11:30am","2:15pm"));
		course.put(net3, hdf );
		
		addf.put("Yawar Ali",Arrays.asList("11:30am","6:15pm"));
		addf.put("Prakash",Arrays.asList("11:30am","6:15pm"));
		addf.put("Bangar Raju",Arrays.asList("11:30am","6:15pm"));
		course.put(net4, addf );
		
		tdf.put("DurgaPrasad",Arrays.asList("7:30am","4:15pm"));
		tdf.put("Sudhakar Sharma",Arrays.asList("7:30am","4:15pm"));
		course.put(net5, tdf);
		
		ndf.put("Vishwa",Arrays.asList("9:30am","8:15pm"));
		ndf.put("Sudhakar L",Arrays.asList("9:30am","8:15pm"));
		course.put(net6, ndf );
		
		edf.put("Vishwa",Arrays.asList("11:30am","6:15pm"));
		edf.put("Prasnath",Arrays.asList("11:30am","8:15pm"));
		course.put(net7, edf );
		
		//Python Trainers
		ppf.put("K V Rao",Arrays.asList("7:30am","4:15pm"));
		ppf.put("Satish Gupta",Arrays.asList("7:30am","4:15pm"));
		ppf.put("Ganapathi Raju",Arrays.asList("7:30am","4:15pm"));
		course.put(python1, ppf );
		
		hpf.put("Sagar",Arrays.asList("11:30am","2:15pm"));
		hpf.put("Durga Prasad",Arrays.asList("11:30am","2:15pm"));
		hpf.put("Srinu",Arrays.asList("11:30am","2:15pm"));
		course.put(python2, hpf );
		
		opf.put("Shiva Chaitanya",Arrays.asList("9:30am","6:15pm"));
		opf.put("Sharma",Arrays.asList("9:30am","6:15pm"));
		opf.put("Vijaya Kumar",Arrays.asList("9:30am","6:15pm"));
		course.put(python3, opf );
		
		dpf.put("Satish Gupta",Arrays.asList("11:30am","6:15pm"));
		dpf.put("K V Rao",Arrays.asList("11:30am","6:15pm"));
		course.put(python4, dpf );
		
		apf.put("Prasad",Arrays.asList("7:30am","4:15pm"));
		apf.put("Sanjay",Arrays.asList("7:30am","4:15pm"));
		course.put(python5, apf);
		
		rpf.put("Ganapathi Raju",Arrays.asList("9:30am","8:15pm"));
		rpf.put("Venkat Raju",Arrays.asList("9:30am","8:15pm"));
		course.put(python6, rpf );
		
		//UI Trainers
		huf.put("DurgaPrasad",Arrays.asList("7:30am","4:15pm"));
		huf.put("Srinu",Arrays.asList("7:30am","4:15pm"));
		course.put(web1, huf );
		
		duf.put("Vijaya Kumar",Arrays.asList("11:30am","2:15pm"));
		duf.put("Shiva Chaitanya",Arrays.asList("11:30am","2:15pm"));
		duf.put("Sharma",Arrays.asList("11:30am","2:15pm"));
		course.put(web2, duf );
		
		juf.put("DurgaPrasad",Arrays.asList("9:30am","6:15pm"));
		juf.put("Sanjay",Arrays.asList("9:30am","6:15pm"));
		juf.put("Sagar",Arrays.asList("9:30am","6:15pm"));
		course.put(web3, juf );
		
		ruf.put("Prasad",Arrays.asList("11:30am","8:15pm"));
		ruf.put("SudhakarSharma",Arrays.asList("11:30am","6:15pm"));
		course.put(web4, ruf );
		
		nuf.put("Sagar",Arrays.asList("7:30am","4:15pm"));
		nuf.put("Sanjay",Arrays.asList("7:30am","4:15pm"));
		course.put(web5, nuf);
		
		wuf.put("DurgaPrasad",Arrays.asList("9:30am","8:15pm"));
		wuf.put("Srinu",Arrays.asList("9:30am","8:15pm"));
		course.put(web6, wuf );
		
		//Data Science Trainers
		pds.put("Kavitha",Arrays.asList("7:30am","4:15pm"));
		pds.put("Shiva Rama Krishna",Arrays.asList("7:30am","4:15pm"));
		pds.put("Daniel",Arrays.asList("7:30am","4:15pm"));
		course.put(ds1, pds );
		
		dds.put("Vijaya Kumar",Arrays.asList("9:30am","6:15pm"));
		dds.put("Shiva Chaitanya",Arrays.asList("9:30am","6:15pm"));
		course.put(ds2, dds );
		
		sds.put("Omkar",Arrays.asList("11:30am","2:15pm"));
		sds.put("Daniel",Arrays.asList("11:30am","2:15pm"));
		course.put(ds3, sds );
		
		nds.put("Shiva Rama Krishna",Arrays.asList("11:30am","6:15pm"));
		nds.put("Daniel",Arrays.asList("11:30am","6:15pm"));
		course.put(ds4, nds );
		
		ads.put("Omkar",Arrays.asList("7:30am","4:15pm"));
		ads.put("Sanjay",Arrays.asList("7:30am","4:15pm"));
		course.put(ds5, ads);
		
		mds.put("Prakash Senapathi",Arrays.asList("9:30am","8:15pm"));
		mds.put("Omkar",Arrays.asList("9:30am","8:15pm"));
		course.put(ds6, mds );
		
		dl.put("Prakash Senapathi",Arrays.asList("11:30am","6:15pm"));
		dl.put("Prasnath",Arrays.asList("11:30am","8:15pm"));
		course.put(ds7, dl );
		}
	
}
