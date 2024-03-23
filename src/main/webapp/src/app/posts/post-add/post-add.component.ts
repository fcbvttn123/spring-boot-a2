import { Component } from '@angular/core';
import { PostService } from '../post.service';
import { FormsModule } from '@angular/forms';
import { Post } from "../post";

@Component({
  selector: 'app-post-add',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './post-add.component.html',
  styleUrl: './post-add.component.css'
})

export class PostAddComponent {
	
	post: Post = {
		id: 0, 
		author: "", 
		topic: "", 
		content: "", 
		datePosted: "", 
		timePosted: ""
	}
	
	constructor(private postService: PostService) { }
	
	savePost(): void {
		const data = {
			//id: this.student.id,
			author: this.post.author,
			topic: this.post.topic,
			content: this.post.content,
			datedPosted: this.post.datePosted,
			timePosted: this.post.timePosted,
		};
		
		this.postService.create(data).subscribe(
			(data: Post) => this.postService.onPostAdded.emit(data)
		);
	}

}
